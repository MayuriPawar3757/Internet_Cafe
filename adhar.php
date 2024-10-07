<?php
$first_name = $_POST['first_name'];
$last_name = $_POST['last_name'];
$phone = $_POST['phone'];
$select_service = $_POST['select_service'];
$select_city = $_POST['select_city'];
// Database connection
$conn = new mysqli('localhost', 'root', '', 'e_smart_cafe');
if ($conn->connect_error) {
    echo "$conn->connect_error";
    die("Connection Failed: " . $conn->connect_error);
} else {
    $stmt = $conn->prepare("INSERT INTO adhar (afirst_name,alast_name,aphone,aselect_service,aselect_city) VALUES (?, ?, ?, ?,?)");
    
    // Check if the prepare statement was successful
    if ($stmt) {
        $stmt->bind_param("sssss",$first_name,$last_name,$phone,$select_service,$select_city);
        $execval = $stmt->execute();
        
        echo $execval;

        echo "<script type='text/javascript'> alert('Inserted Successfully'); 
                window.location='services.html';</script>";
        exit();

        $stmt->close();
    } else {
        echo "Error in the prepared statement: " . $conn->error;
    }

    $conn->close();
}
?>

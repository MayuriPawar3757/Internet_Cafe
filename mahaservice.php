<?php
$afirst_name = $_POST['afirst_name'];
$alast_name = $_POST['alast_name'];
$aemail = $_POST['aemail'];
$aphone = $_POST['aphone'];
$aselect_service = isset($_POST['aselect_service']) ? $_POST['aselect_service'] : '';
$aselect_city = isset($_POST['aselect_city']) ? $_POST['aselect_city'] : '';

// Database connection
$conn = new mysqli('localhost', 'root', '', 'e_smart_cafe');
if ($conn->connect_error)
    {
    echo "$conn->connect_error";
    die("Connection Failed: " . $conn->connect_error);
    } else {
    $stmt = $conn->prepare("INSERT INTO adhar (afirst_name, alast_name, aemail, aphone, aselect_service,aselect_city) VALUES (?, ?, ?, ?, ?, ?)");
    
    // Check if the prepare statement was successful
    if ($aselect_service !== null && $aselect_city !== null) {
        // Prepare the SQL statement with placeholders
        $sql = "INSERT INTO adhar (aselect_service, aselect_city) VALUES ( ?, ?)";
        
        // Prepare the SQL statement
        
        // Bind parameters
        $stmt->bind_param('sss', $aselect_service, $aselect_city);
    
        // Execute the statement
        $stmt->execute();
        echo "Inserted Succesfully";

        // Close the statement
        $stmt->close();
    } else {
        // Handle the case where one or more values are null
        echo "One or more values are null. Cannot execute the query.";
    }
    

    $conn->close();
}
?>

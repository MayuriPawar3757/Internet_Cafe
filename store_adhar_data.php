<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if(isset($_POST['first_name'], $_POST['last_name'], $_POST['email'], $_POST['phone'], $_POST['select_service'], $_POST['select_city'], $_POST['date_time'])) {
        $first_name = $_POST['first_name'];
        $last_name = $_POST['last_name'];
        $email = $_POST['email'];
        $phone = $_POST['phone'];
        $select_service = $_POST['select_service'];
        $select_city = $_POST['select_city'];
        $date_time = $_POST['date_time'];

        // Database connection
        $conn = new mysqli('localhost', 'root', '', 'e_smart_cafe');
        if ($conn->connect_error) {
            die("Connection Failed: " . $conn->connect_error);
        } else {
            $stmt = $conn->prepare("INSERT INTO adhar (first_name, last_name, email, phone, select_service, select_city, date_time) VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            if ($stmt) {
                $stmt->bind_param("sssssss", $first_name, $last_name, $email, $phone, $select_service, $select_city, $date_time);
                $execval = $stmt->execute();
                
                if ($execval) {
                    echo "<script type='text/javascript'> alert('Data stored successfully'); 
                        window.location='adhar.html';</script>";
                    exit();
                } else {
                    echo "Error: " . $stmt->error;
                }

                $stmt->close();
            } else {
                echo "Error in the prepared statement: " . $conn->error;
            }

            $conn->close();
        }
    } else {
        echo "<script type='text/javascript'> alert('Form fields are missing.'); </script>";
    }
}
?>

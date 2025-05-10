document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission

    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if (username === "admin" && password === "1234") {
        document.getElementById("message").innerHTML = "Login successful!";
        document.getElementById("message").style.color = "green";
    } else {
        document.getElementById("message").innerHTML = "Invalid username or password!";
        document.getElementById("message").style.color = "red";
    }
});
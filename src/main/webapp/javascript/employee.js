$("#employeeForm").submit(function(e) {

    var url = "path/to/your/script.php"; // the script where you handle the form input.

    $.ajax({
        type: "POST",
        url: url,
        data: $("#idForm").serialize(), // serializes the form's elements.
        success: function(data)
        {
            alert(data); // show response from the php script.
        }
    });

    e.preventDefault(); // avoid to execute the actual submit of the form.
});

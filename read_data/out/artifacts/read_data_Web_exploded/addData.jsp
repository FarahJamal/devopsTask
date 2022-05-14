<head>
    <title>Todos</title>
    <!-- Required meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<div class="container">
    <form method="POST" action="/api/marks">
        <fieldset class="form-group">
            <label>Student Roll</label>
            <input required name="studentRoll" type="number"
                   class="form-control"
                   required
            /> <BR />

        </fieldset>

        <fieldset class="form-group">
            <label>Course Id</label>
            <input required name="course_id" type="number"
                   class="form-control"
                   required
            /> <BR />

        </fieldset>
        <fieldset class="form-group">
            <label>Mark</label>
            <input required name="mark" type="number"
                   class="form-control" /> <BR />
        </fieldset>

        <fieldset class="form-group">
            <label>Instructor</label>
            <input required name="instructor" type="text"
                   class="form-control" /> <BR />
        </fieldset>

        <fieldset class="form-group">
            <label>Course Name</label>
            <input name="courseName" id="courseName" required="" type="text" class="form-control"/>
            <BR />
        </fieldset>

        <br/>
        <input required type="submit" class="btn btn-success" value="Submit" />
    </form>
</div>

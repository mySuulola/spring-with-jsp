<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Todos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div id="list-todos">
    <div class="container">
        <h1>Todos</h1>
        <p>Hi, ${username}</p>
        <p>Here are the list of your to-dos </p>

        <table class="table table-striped">
            <caption>All to-dos</caption>
            <thead>
            <tr>
                <th scope="col"></th>
                <th scope="col">Description</th>
                <th scope="col">Deadline</th>
<%--                <th scope="col">Status</th>--%>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <th scope="row">${todo.id + 1}</th>
                    <td>${todo.description}</td>
                    <td> <fmt:formatDate value="${todo.deadline}" pattern="dd/MM/YYYY" /> </td>
<%--                    <td>${todos}</td>--%>
                    <td>
                        <button class="btn btn-danger">Delete
                        </button>
                    </td>
                </tr>
            </c:forEach>
            <p>${todos}</p>
            </tbody>
        </table>





        <button type="button" data-toggle="modal" class="btn btn-primary" data-target="#addTodoModal">
            Add Todos
        </button>

        <div class="modal fade" id="addTodoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Add Todo</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="/add-todo" method="post">
                            <div class="form-group">
                                <label for="description">Description</label>
                                <input
                                        id="description"
                                        class="form-control"
                                        required="required"
                                        placeholder="Enter Todo Description" 
                                        name="description"
                                />
                                <small class="form-text text-muted">Specify the tasks to be done.</small>
                            </div>
                            <div class="form-group">
                                <label for="deadline">Date to be completed</label>
                                <input
                                        type="date"
                                        class="form-control"
                                        id="deadline"
                                        placeholder="Deadline"
                                        name="deadline" />
                            </div>

                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
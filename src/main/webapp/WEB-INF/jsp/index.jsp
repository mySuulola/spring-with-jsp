<!doctype html>

<%@page info="Home page of the app" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="css/main.css" rel="stylesheet" />
    <title>${name}</title>
</head>
<body>
  <div>
      <div>
          <h1>Welcome ${name}</h1>
          <p> <a href="contact" >Contact us</a> </p>
      </div>
  </div>

<script src="/js/main.js" ></script>
</body>
</html>
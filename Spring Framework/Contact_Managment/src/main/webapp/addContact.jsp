<!DOCTYPE html>
<html>
<head>
  <title>Add Contact</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="container mt-5">
  <h2>Add New Contact</h2>
  
  <form action="AddContactServlet" method="post" class="mt-3">
    <div class="mb-3">
      <label>Name</label>
      <input type="text" name="name" class="form-control" required />
    </div>
    <div class="mb-3">
      <label>Email</label>
      <input type="email" name="email" class="form-control" required />
    </div>
    <div class="mb-3">
      <label>Phone</label>
      <input type="text" name="phone" class="form-control" required />
    </div>
    <button type="submit" class="btn btn-primary">Save</button>
    <a href="index.jsp" class="btn btn-secondary">Cancel</a>
  </form>
</body>
</html>

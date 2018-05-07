// **JSON --> 对象**
//GSON解析: 非静态的解析方式, 有版本控制
//Gson gson = new Gson();
//User user = gson.fromJson(src, User.class);
//System.out.println(user.toString());
//System.out.println(user.getText());
Gson gson = new GsonBuilder().setVersion(1.1).create();
User user = gson.fromJson(src, User.class);
System.out.println(user.getText());
System.out.println(user.getX());
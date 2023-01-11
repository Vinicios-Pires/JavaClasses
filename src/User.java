public class User {
  String name;
  private String email;
  University university = new University();

  public String getEmail(){
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

package grailsproject

class Employee {
    String id
    String name
    String email
    String phone
    String department

    static constraints = {
        id blank: false, unique: true
        name blank: false
        email blank: false, unique: true, email: true
        phone blank: false, unique: true
        department blank: false
    }
}

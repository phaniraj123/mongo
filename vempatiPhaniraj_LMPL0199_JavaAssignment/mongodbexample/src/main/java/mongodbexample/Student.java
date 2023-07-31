package mongodbexample;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

    @Id
    private int id;

    private String name;
  
    private String city;

    private String college;

    private String branch;

    private float gpa;

 

    public Student(int id, String name, String city, String college, String Branch, float GPA) {

        this.id = id;

        this.name = name;

        this.city = city;

        this.college = college;

        this.branch = Branch;

        this.gpa = GPA;

    }

 

    public int getId() {

        return id;

    }

 

    public void setId(int id) {

        this.id = id;

    }

 

    public String getName() {

        return name;

    }

 

    public void setName(String name) {

        this.name = name;

    }

 

    public String getCity() {

        return city;

    }

 

    public void setCity(String city) {

        this.city = city;

    }

 

    public String getCollege() {

        return college;

    }

 

    public void setCollege(String college) {

        this.college = college;

    }

 

    public String getStudentBranch() {

        return branch;

    }

 

    public void setStudentBranch(String Branch) {

        this.branch = Branch;

    }

 

    public float getStudentGPA() {

        return gpa;

    }

 

    public void setStudentGPA(float GPA) {

        this.gpa = GPA;

    }

 

    public Object getAllStudents() {

        return null;

    }

 

}

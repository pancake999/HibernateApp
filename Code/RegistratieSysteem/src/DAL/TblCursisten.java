package DAL;
// Generated Dec 3, 2014 4:21:25 PM by Hibernate Tools 4.3.1



/**
 * TblCursisten generated by hbm2java
 */
public class TblCursisten  implements java.io.Serializable {


     private Integer id;
     private int cursistId;
     private String module;
     private String email;

    public TblCursisten() {
    }

    public TblCursisten(int cursistId, String module, String email) {
       this.cursistId = cursistId;
       this.module = module;
       this.email = email;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getCursistId() {
        return this.cursistId;
    }
    
    public void setCursistId(int cursistId) {
        this.cursistId = cursistId;
    }
    public String getModule() {
        return this.module;
    }
    
    public void setModule(String module) {
        this.module = module;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registratiesysteem.BLL;

/**
 *
 * @author ARISTOCRAT
 */
public class Cursist {  
        private String cursistID;
        private String cursist;
        private String module;
        private String email;

        public String getCursistID() {
            return cursistID;
        }

        public void setCursistID(String cursistID) {
            this.cursistID = cursistID;
        }

        public String getCursist() {
            return cursist;
        }

        public void setCursist(String cursist) {
            this.cursist = cursist;
        }

        public String getModule() {
            return module;
        }

        public void setModule(String modules) {
            this.module = modules;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}

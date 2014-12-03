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
public class Docent {   
        private String docentID;
        private String docent;
        private String module;
        private String email;

        public String getDocentID() {
            return docentID;
        }

        public void setDocentID(String docentID) {
            this.docentID = docentID;
        }

        public String getDocent() {
            return docent;
        }

        public void setDocent(String docent) {
            this.docent = docent;
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

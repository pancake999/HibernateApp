/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registratiesysteem;

/**
 *
 * @author ARISTOCRAT
 */
public class BLL {
    
    public class Docent {     
        private String docentID;
        private String docent;
        private String modules;
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

        public String getModules() {
            return modules;
        }

        public void setModules(String modules) {
            this.modules = modules;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }
    
    public class Cursist{    
        private String cursistID;
        private String cursist;
        private String modules;
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

        public String getModules() {
            return modules;
        }

        public void setModules(String modules) {
            this.modules = modules;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
    
    public class Module {       
        private String moduleID;
        private String module;
        private String beschrijving;

        public String getModuleID() {
            return moduleID;
        }

        public void setModuleID(String moduleID) {
            this.moduleID = moduleID;
        }

        public String getModule() {
            return module;
        }

        public void setModule(String module) {
            this.module = module;
        }

        public String getBeschrijving() {
            return beschrijving;
        }

        public void setBeschrijving(String beschrijving) {
            this.beschrijving = beschrijving;
        }
    }
    
    public class Lokaal {
        private String lokaalID;
        private String capaciteit;

        public String getLokaalID() {
            return lokaalID;
        }

        public void setLokaalID(String lokaalID) {
            this.lokaalID = lokaalID;
        }

        public String getCapaciteit() {
            return capaciteit;
        }

        public void setCapaciteit(String capaciteit) {
            this.capaciteit = capaciteit;
        }
    }

}

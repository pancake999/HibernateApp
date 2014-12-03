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

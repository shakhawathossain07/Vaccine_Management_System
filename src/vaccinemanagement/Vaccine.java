
package vaccinemanagement;

   
  public  class Vaccine {

        private String name;
        private String id;
        private String vaccineName;
        private String dose;
        
        
        public Vaccine(String name, String id, String vaccineName, String dose) {
            this.name = name;
            this.id = id;
            this.vaccineName = vaccineName;
            this.dose = dose;
        }
        
        public String getName() {
            return name;
        }

        
        public String getId() {
            return id;
        }

        public String getVaccineName() {
            return vaccineName;
        }

        public String getDose() {
            return dose;
        }
        public void setDose(String Dose){
            this.dose=Dose;
        }
    }

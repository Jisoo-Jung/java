package list.task.hospital;


public class Hospital {
//   -의사 
      private String docter;
//    - 간호사
      private String nuse;
//   -환자 
      private String patient; 
//   -진료비        
      private int medicalexpenses;
   
      public Hospital() {;}
      
      
      public Hospital(String docter, String nuse, String patient,  int  medicalexpenses) {
         super();
         this.docter = docter;
         this.nuse = nuse;
         this.patient = patient;
         this.medicalexpenses = medicalexpenses;
         
         
      }


      public String getDocter() {
         return docter;
      }


      public void setDocter(String docter) {
         this.docter = docter;
      }


      public String getNuse() {
         return nuse;
      }


      public void setNuse(String nuse) {
         this.nuse = nuse;
      }


      public String getPatient() {
         return patient;
      }


      public void setPatient(String patient) {
         this.patient = patient;
      }


      public int getMedicalexpenses() {
         return medicalexpenses;
      }


      public void setMedicalexpenses(int medicalexpenses) {
         this.medicalexpenses = medicalexpenses;
      }


      @Override
      public String toString() {
         return "Hospital [docter=" + docter + ", nuse=" + nuse + ", patient=" + patient + ", medicalexpenses="
               + medicalexpenses + "]";
      }


      

      @Override
      public boolean equals(Object obj) {
         if (this == obj)
            return true;
         if (obj == null)
            return false;
         if (getClass() != obj.getClass())
            return false;
         Hospital other = (Hospital) obj;
            return docter.equals(other.docter);   
      }


      

      
      
      }
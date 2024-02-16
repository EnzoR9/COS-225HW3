


public class PatientTester 
{
   
    public static void main(String[] args)
    {
        PatientManager patientManager = new PatientManager();
        System.out.println(patientManager);

        // adding new patients 
        patientManager.addPatient(new Patient(1, 200));
        patientManager.addPatient(new Patient(2, 400));
        patientManager.addPatient(new Patient(3, 600));
        patientManager.addPatient(new Patient(4, 800));

        System.out.println(patientManager);

        patientManager.caffeineAbsorption();
        patientManager.caffeineAbsorption();

        System.out.println(patientManager);

        // finding the patient with the highest amount of caffeine so far
        // (I think theres a better way to do this but this is the first that came to mind and worked)
        int highestIndex = -1;
        double highestCaff = Double.MIN_VALUE; 
        for (int i = 0; i < patientManager.getPatientCount(); i++)
        {
            Patient patient = patientManager.getPatient(i);
            if (patient.getCaffeineLevel() > highestCaff)
            {
                highestIndex = i;
                highestCaff = patient.getCaffeineLevel();
            }
        }
        // removing patient 
        if (highestIndex != -1)
        {
            patientManager.remPatient(highestIndex);
        }

        

    }

}

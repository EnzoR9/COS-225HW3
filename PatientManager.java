import java.util.ArrayList;

public class PatientManager 
{
    public ArrayList<Patient> patients;

    public PatientManager()
    {
        this.patients = new ArrayList<Patient>();
    }

    //add a Patient object to the first available spot in the patient array. 
    public int addPatient(Patient patient)
    {
        patients.add(patient);
        return patients.size() - 1;
    }

    // remove and return a Patient object at a given index in the patient array.
    public Patient remPatient(int index)
    {
        if (index >= 0 && index < patients.size())
        {
            return patients.remove(index);
        }
        else 
        {
            return null; 
        }
    }

    // method that reduces the caffeine level of every patient in the patient array by 130
    public void caffeineAbsorption()
    {
        for (int i = 0; i < patients.size(); i++)
        {
            patients.get(i).setCaffineLevel(patients.get(i).getCaffeineLevel() - 130);
            if (patients.get(i).getCaffeineLevel() <= 0)
            {
                patients.remove(i);
                i--;
            }
        }
    }
    // extra getters
    public int getPatientCount()
    {
        return patients.size();
    }

    public Patient getPatient(int index)
    {
        if (index >= 0 && index < patients.size())
        {
            return patients.get(index);
        }
        else
        {
            return null;
        }
    }

    
    public String toString()
    {
        if (patients.isEmpty())
        {
            return "Empty";
        }
        else
        {
            String result = "";

            for (Patient patient : patients)
            {
                result += patient.getIdNumber() + " " + patient.getCaffeineLevel() + "\n";
            }
            return result.trim(); // added trim because it kept printing this annoying space halfway inbetween my output 
        }
    }
    
   
}

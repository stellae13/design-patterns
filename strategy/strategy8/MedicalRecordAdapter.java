package strategy8;

import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    @Override
    public String getFirstName() {
        return record.getName().substring(0, record.getName().indexOf(" "));
    }

    @Override
    public String getLastName() {
        return record.getName().substring(record.getName().indexOf(" ") + 1);
    }

    @Override
    public Date getBirthday() {
        return record.getBirthdate();
    }

    @Override
    public Gender getGender() {
        String gender = record.getGender();
        if (gender.equalsIgnoreCase("male"))
            return Gender.MALE;
        else if (gender.equalsIgnoreCase("female"))
            return Gender.FEMALE;
        else
            return Gender.OTHER;

    }

    @Override
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);

    }

    @Override
    public ArrayList<Visit> getVisitHistory() {

        ArrayList<String> history = record.getHistory();
        ArrayList<Visit> toReturn = new ArrayList<Visit>();
        for (String visit : history) {

        }
        return toReturn;

    }

    public String toString() {
        return record.toString();
    }

}

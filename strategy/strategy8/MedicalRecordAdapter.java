package strategy8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        String date;
        Date dateFormatted = null;
        String well;
        boolean wellBool;
        String description;
        for (String visit : history) {
            date = visit.substring(visit.indexOf("Visit: ") + 11, visit.indexOf("\n")); // need to convert
            well = visit.substring((visit.indexOf("Well visit: ") + 12),
                    visit.indexOf("\n", visit.indexOf("Well visit: "))); //
            description = visit.substring(visit.indexOf("Comments: ") + 10,
                    visit.indexOf("\n", visit.indexOf("Comments: ")));

            try {
                dateFormatted = new SimpleDateFormat("dd, MM, yyyy").parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            if (well.equalsIgnoreCase("true"))
                wellBool = true;
            else
                wellBool = false;

            toReturn.add(new Visit(dateFormatted, wellBool, description));

        }
        return toReturn;

    }

    public String toString() {
        String toReturn = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String birthday = simpleDateFormat.format(getBirthday());
        toReturn += "Birthday: " + birthday + "\n";
        String gender = record.getGender();
        toReturn += "Gender: ";

        if (gender.equalsIgnoreCase("male"))
            toReturn += "Male" + "\n";
        else
            toReturn += "Female" + "\n";

        toReturn += "Medical Visit History: \n";

        if (getVisitHistory().size() == 0) {
            toReturn += "No visits yet";
        } else {
            for (Visit visit : getVisitHistory()) {
                toReturn += visit.toString() + "\n";
            }
        }
        return toReturn;
    }

}

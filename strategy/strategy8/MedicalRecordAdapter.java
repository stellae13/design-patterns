package strategy8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * MedicalRecordAdapter is a Medical Record
 * 
 * @author Stella Garcia
 */
public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record; // the health record we want to adapt

    /**
     * Constructor
     * 
     * @param record sets the HealhRecord to adapt
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * returns the first name of the patient must use substring because the old
     * system stored the full name in one string
     * 
     * @return String of the first name
     */
    @Override
    public String getFirstName() {
        return record.getName().substring(0, record.getName().indexOf(" "));
    }

    /**
     * returns the last name of the patient must use substring because the old
     * system stored the full name in one string
     * 
     * @return String of the last name
     */
    @Override
    public String getLastName() {
        return record.getName().substring(record.getName().indexOf(" ") + 1);
    }

    /**
     * getBirthday method gets the birthday from the record
     * 
     * @return Date the birthday
     */
    @Override
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * getGender method converts from a String to a Gender type
     * 
     * @return Gender (enum) from the original string
     */
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

    /**
     * adds the visit to the arrayList
     * 
     * @param date        Date the date of the visit
     * @param well        boolean if the patient is welll or not
     * @param description String a comment about the visit
     */
    @Override
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);

    }

    /**
     * Converts all of the Strings stored in the ArrayList of visits into Visit
     * types
     * 
     * @return ArrayList<Visit> all the visits in the correct format
     */
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
                    visit.indexOf("\n", visit.indexOf("Well visit: ")));
            description = visit.substring(visit.indexOf("Comments: ") + 10,
                    visit.indexOf("\n", visit.indexOf("Comments: ")));

            try {
                dateFormatted = new SimpleDateFormat("dd, MM, yyyy").parse(date); // converts to correct format
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

    /**
     * toString method format specified in assignment description
     * 
     * @return String what we want to print when we print out the medical record
     */
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

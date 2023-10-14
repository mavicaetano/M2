package m2s02.exercicio5;

import java.time.LocalDate;

public class FrequenciaCardiaca {
    private String name;
    private String surname;
    private String birthDate;

    public FrequenciaCardiaca(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int calculateAge() {
        LocalDate current = LocalDate.now();
        int currentYear = current.getYear();
        int currentMonth = current.getMonthValue();
        int currentDay = current.getDayOfMonth();

        String[] birthDateArrayFormat = this.birthDate.split("/");
        int birthYear = Integer.parseInt(birthDateArrayFormat[2]);
        int birthMonth = Integer.parseInt(birthDateArrayFormat[1]);
        int birthDay = Integer.parseInt(birthDateArrayFormat[0]);

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth) {
            age--;
        } else if (currentMonth == birthMonth) {
            if (currentDay < birthDay) {
                age --;
            }
        }

        return age;
    }

    public int maxHeartRate() {
        return 220 - calculateAge();
    }

    public double[] targetHeartRate() {
        double[] heartRateInterval = new double[2];
        heartRateInterval[0] = maxHeartRate() * 0.5;
        heartRateInterval[1] = maxHeartRate() * 0.85;

        return heartRateInterval;
    }
}

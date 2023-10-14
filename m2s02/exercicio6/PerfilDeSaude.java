package m2s02.exercicio6;

import java.time.LocalDate;

public class PerfilDeSaude {
    private String name;
    private String surname;
    private String birthDate;
    private String gender;
    private double weight;
    private double height;

    public PerfilDeSaude(String name, String surname, String birthDate, String gender, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public String fullName () {
        return name + " " + surname;
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

    public double imc() {
        return this.weight / (this.height * this.height);
    }
}

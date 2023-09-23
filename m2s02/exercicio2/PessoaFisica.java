package m2s02.exercicio2;

public class PessoaFisica {
    private String firstName;
    private String surname;
    private String cpf;
    private String birthDate;
    private String gender;
    private String tel;
    private String email;
    private String address;

    public PessoaFisica(String cpf) {
        setCpf(cpf);
    }

    private boolean isCpfValid (String cpf) {
        return cpf.length() == 11;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (isCpfValid(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

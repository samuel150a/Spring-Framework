package co.dto;

public class FIRDto {

    private String pname;
    private String name;
    private String complaint;
    private String city;
    private String aadhar;

    public void setpname(String pname) {

        this.pname = pname;
    }


    public void setname(String name) {

        this.name = name;
    }

    public void setcomplaint(String complaint) {

        this.complaint = complaint;
    }

    public void setcity(String city) {

        this.city = city;
    }

    public void setaadhar(String aadhar) {

        this.aadhar = aadhar;
    }

    public String getpname() {
        return pname;
    }

        public String getname() {
            return name;

        }
        public String getcomplaint()
        {
            return complaint;

        }

        public String getcity()
        {
            return city;
        }

        public String getaadhar()
        {
            return aadhar;
        }
    }


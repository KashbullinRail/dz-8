package lights;

public class LED implements Light{
    @Override
    public String illuminates() {
        return "Светит отлично";
    }
}

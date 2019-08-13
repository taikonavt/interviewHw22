import java.util.List;

public class ScreenReport implements Strategy {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to screen");
        for(ReportItem item : items){
            System.out.format("screen %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}

package Practice.Features.StepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class Pipes {
    @Given("To try pipes of list")
    public void to_try_pipes_of_list(DataTable dataTable) {
        List<String> stringList=dataTable.asList();
        stringList
                .stream()
                .forEach(System.out::println);
    }
    @Given("Trying list of map")
    public void trying_list_of_map(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps();
        mapList
                .stream()
                .map(e -> {
                    String Username = e.get("Username");
                    String email = e.get("Email");
                    String password = e.get("Password");
                    return Username+" "+email+" "+password;
                })
                .forEach(System.out::println);
    }
    @Given("Trying as map")
    public void trying_as_map(io.cucumber.datatable.DataTable dataTable) {
       Map<String,String> maps=dataTable.asMap();
       maps.entrySet()
               .stream()
               .map(e->{
                   return e.getKey()+" "+e.getValue();
               })
               .forEach(System.out::println);
    }


}

package service;


import Model.RestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestService {
    @Autowired
    private restRepository restRepository;
    private restRepository restRepository1;

    public RestModel addallModel(RestModel restModel1){
        return restRepository.(restModel1);
    }


}

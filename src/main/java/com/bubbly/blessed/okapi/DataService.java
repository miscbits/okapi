package com.bubbly.blessed.okapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private List<Okapi> okapiList = new ArrayList<>();

    public Okapi addToList(Okapi o) {
        okapiList.add(o);
        return o;
    }

    public Okapi retrieveFromList(Integer id) {
        for (Okapi o: okapiList) {
            if (o.getId().equals(id)){
                return o;
            }
        }
        return null;
    }
}

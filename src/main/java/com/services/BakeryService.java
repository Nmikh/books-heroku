package com.services;

import com.dao.BakeryRepository;
import com.models.BakeryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class BakeryService {
    @Autowired
    private BakeryRepository bakeryRepository;

    public BakeryEntity saveBake(BakeryEntity bake) {
        return bakeryRepository.save(bake);
    }

    public List<BakeryEntity> getAllBake() {
        return bakeryRepository.findAll();
    }

    public BakeryEntity getMaxPriceBake() {
        return getAllBake().stream()
                .max(Comparator.comparing(BakeryEntity::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public List<BakeryEntity> getExpiredBake() {
        return getAllBake().stream()
                .filter(bake -> bake.getDateEnd().before(new Date(Calendar.getInstance().getTime().getTime())))
                .collect(Collectors.toList());
    }


}

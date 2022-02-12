package com.homeward.webstore.service.store;

import com.homeward.webstore.mapper.StoreMapper;
import com.homeward.webstore.pojo.packages.ItemsList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final StoreMapper storeMapper;
    public StoreServiceImpl(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    @Override
    public List<ItemsList> getSpecificItems(String type) {
        return storeMapper.getStoreItems(type);
    }
}
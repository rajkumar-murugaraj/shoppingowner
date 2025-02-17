package com.shoppingmall_shopowner.shoppingmall_shopowner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MallService {
    @Autowired
    private MallRepository mallRepository;

    public List<Mall> getAllMalls() {
        return mallRepository.findAll();
    }

    public Mall getMallById(Long id) {
        return mallRepository.findById(id).orElse(null);
    }

    public Mall addMall(Mall mall) {
        return mallRepository.save(mall);
    }

    public Mall updateMall(Long id, Mall mallDetails) {
        Mall mall = mallRepository.findById(id).orElse(null);
        if (mall != null) {
            mall.setName(mallDetails.getName());
            mall.setLocation(mallDetails.getLocation());
            mall.setNumberOfShops(mallDetails.getNumberOfShops());
            mall.setOwnerName(mallDetails.getOwnerName());
            return mallRepository.save(mall);
        }
        return null;
    }

    public void deleteMall(Long id) {
        mallRepository.deleteById(id);
    }
}
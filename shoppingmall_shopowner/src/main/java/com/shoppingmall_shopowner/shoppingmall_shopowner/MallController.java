package com.shoppingmall_shopowner.shoppingmall_shopowner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mall")
public class MallController {
    @Autowired
    private MallService mallService;

    @GetMapping
    public List<Mall> getAllMalls() {
        return mallService.getAllMalls();
    }

    @GetMapping("/{id}")
    public Mall getMallById(@PathVariable Long id) {
        return mallService.getMallById(id);
    }

    @PostMapping
    public Mall addMall(@RequestBody Mall mall) {
        return mallService.addMall(mall);
    }

    @PutMapping("/{id}")
    public Mall updateMall(@PathVariable Long id, @RequestBody Mall mall) {
        return mallService.updateMall(id, mall);
    }

    @DeleteMapping("/{id}")
    public void deleteMall(@PathVariable Long id) {
        mallService.deleteMall(id);
    }
}
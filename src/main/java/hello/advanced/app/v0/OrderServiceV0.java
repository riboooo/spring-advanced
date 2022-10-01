package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV0 {
    private final OderRepositoryV0 oderRepository;

    public void orderItem(String itemId){
        oderRepository.save(itemId);
    }
}

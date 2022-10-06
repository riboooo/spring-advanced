package hello.advanced.app.v0;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceV0 {
	private final OrderRepositoryV0 oderRepository;

	public void orderItem(String itemId) {
		oderRepository.save(itemId);
	}
}

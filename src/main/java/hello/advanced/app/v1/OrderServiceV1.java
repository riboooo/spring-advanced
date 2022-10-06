package hello.advanced.app.v1;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceV1 {
	private final OderRepositoryV1 oderRepository;

	public void orderItem(String itemId) {
		oderRepository.save(itemId);
	}
}

package com.suplier.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.suplier.api.domain.Products;

@FeignClient(name="suplier-service")
public interface SuplierServiceClient {
	@GetMapping("/product/getProductsBySuplierCode/{suplierCode}")
	public List<Products> getSuplierProducts(@PathVariable String suplierCode);
}

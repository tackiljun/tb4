package org.zerock.tb4.mappers;

import java.util.List;
import java.util.Map;

import org.zerock.tb4.dto.PageRequestDTO;
import org.zerock.tb4.dto.ProductListDTO;
import org.zerock.tb4.dto.ProductRegisterDTO;

public interface ProductMapper {

    List<ProductListDTO> getList(PageRequestDTO pageRequestDTO);

    int insertProduct(ProductRegisterDTO productRegisterDTO);

    int insertImages(List<Map<String,String>> imageList);
    
}

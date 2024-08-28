package com.example.demo.core.utilities.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ModelMapperManager implements ModelMapperService {

    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration()
        .setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.LOOSE);   // burada baglama strategiyasi loose  dir yeni eger responsede yani gonderide eger bezi deyisenler yoxdursa onlari nezere alma, (meselen databasede ki tablede 5 sutun var ama bunun sadece 2 sutunu response kimi client verilmelidi bu zaman baglama strategiyasi kimi loose isdifade olunur)

        return this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
        .setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.STANDARD);   // burada ise baglama strategiyasi kimi  standard isdifade olunub, yeni databasedeki table nece sutun varsa herbirinin qarsiligi olmalidi (isdifadeci sorgu gonderende butun xanalari doldurmalidiki, databasedeki butun sutunlar doldurulsun)
        
        return this.modelMapper;
    }
    
}

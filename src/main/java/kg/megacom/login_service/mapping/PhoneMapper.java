package kg.megacom.login_service.mapping;

import kg.megacom.login_service.models.dto.PhoneDto;
import kg.megacom.login_service.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);
    Phone phoneDtoToPhone(PhoneDto phonesDto);
    PhoneDto phoneToPhoneDto(Phone phones);
    void updatePhoneFromDto(PhoneDto phonesDto, @MappingTarget Phone phones);
}

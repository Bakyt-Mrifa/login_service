package kg.megacom.login_service.mapping;
import kg.megacom.login_service.models.dto.AccountDto;
import kg.megacom.login_service.models.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccauntMapper {

    AccauntMapper INSTANCE = Mappers.getMapper(AccauntMapper.class);
    Account accountsDtoToAccaunt(AccountDto accountsDto);
    AccountDto accountsToAccauntDto(Account accounts);
    void updateAccauntFromDto(AccountDto accountsDto, @MappingTarget Account accounts);
}

package ru.team38.common.mappers;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import javax.annotation.processing.Generated;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.team38.common.dto.account.AccountDto;
import ru.team38.common.jooq.tables.records.AccountRecord;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-15T12:50:20+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (IBM Corporation)"
)
public class AccountMapperImpl implements AccountMapper {

    private final DatatypeFactory datatypeFactory;

    public AccountMapperImpl() {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        }
        catch ( DatatypeConfigurationException ex ) {
            throw new RuntimeException( ex );
        }
    }

    @Override
    public AccountDto accountRecordToAccountDto(AccountRecord accountRecord) {
        if ( accountRecord == null ) {
            return null;
        }

        AccountDto.AccountDtoBuilder accountDto = AccountDto.builder();

        accountDto.id( accountRecord.getId() );
        accountDto.isDeleted( accountRecord.getIsDeleted() );
        accountDto.firstName( accountRecord.getFirstName() );
        accountDto.lastName( accountRecord.getLastName() );
        accountDto.email( accountRecord.getEmail() );
        accountDto.password( accountRecord.getPassword() );
        accountDto.phone( accountRecord.getPhone() );
        accountDto.about( accountRecord.getAbout() );
        accountDto.city( accountRecord.getCity() );
        accountDto.country( accountRecord.getCountry() );
        accountDto.regDate( map( accountRecord.getRegDate() ) );
        accountDto.birthDate( accountRecord.getBirthDate() );
        accountDto.messagePermission( accountRecord.getMessagePermission() );
        accountDto.lastOnlineTime( map( accountRecord.getLastOnlineTime() ) );
        accountDto.isOnline( accountRecord.getIsOnline() );
        accountDto.isBlocked( accountRecord.getIsBlocked() );
        accountDto.photo( accountRecord.getPhoto() );
        accountDto.profileCover( accountRecord.getProfileCover() );
        accountDto.createdOn( map( accountRecord.getCreatedOn() ) );
        accountDto.updatedOn( map( accountRecord.getUpdatedOn() ) );

        return accountDto.build();
    }

    @Override
    public AccountRecord accountDtoToAccountRecord(AccountDto accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        AccountRecord accountRecord = new AccountRecord();

        accountRecord.setIsDeleted( accountDto.getIsDeleted() );
        accountRecord.setFirstName( accountDto.getFirstName() );
        accountRecord.setLastName( accountDto.getLastName() );
        accountRecord.setEmail( accountDto.getEmail() );
        accountRecord.setPassword( accountDto.getPassword() );
        accountRecord.setPhone( accountDto.getPhone() );
        accountRecord.setPhoto( accountDto.getPhoto() );
        accountRecord.setAbout( accountDto.getAbout() );
        accountRecord.setCity( accountDto.getCity() );
        accountRecord.setCountry( accountDto.getCountry() );
        accountRecord.setRegDate( xmlGregorianCalendarToLocalDateTime( zonedDateTimeToXmlGregorianCalendar( accountDto.getRegDate() ) ) );
        accountRecord.setBirthDate( accountDto.getBirthDate() );
        accountRecord.setMessagePermission( accountDto.getMessagePermission() );
        accountRecord.setLastOnlineTime( xmlGregorianCalendarToLocalDateTime( zonedDateTimeToXmlGregorianCalendar( accountDto.getLastOnlineTime() ) ) );
        accountRecord.setIsOnline( accountDto.getIsOnline() );
        accountRecord.setIsBlocked( accountDto.getIsBlocked() );
        accountRecord.setCreatedOn( xmlGregorianCalendarToLocalDateTime( zonedDateTimeToXmlGregorianCalendar( accountDto.getCreatedOn() ) ) );
        accountRecord.setUpdatedOn( xmlGregorianCalendarToLocalDateTime( zonedDateTimeToXmlGregorianCalendar( accountDto.getUpdatedOn() ) ) );
        accountRecord.setId( accountDto.getId() );
        accountRecord.setProfileCover( accountDto.getProfileCover() );

        return accountRecord;
    }

    private static LocalDateTime xmlGregorianCalendarToLocalDateTime( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        if ( xcal.getYear() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMonth() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getDay() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getHour() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMinute() != DatatypeConstants.FIELD_UNDEFINED
        ) {
            if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED
                && xcal.getMillisecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond(),
                    Duration.ofMillis( xcal.getMillisecond() ).getNano()
                );
            }
            else if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond()
                );
            }
            else {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute()
                );
            }
        }
        return null;
    }

    private XMLGregorianCalendar zonedDateTimeToXmlGregorianCalendar( ZonedDateTime zdt ) {
        if ( zdt == null ) {
            return null;
        }

        return datatypeFactory.newXMLGregorianCalendar( GregorianCalendar.from( zdt ) );
    }
}

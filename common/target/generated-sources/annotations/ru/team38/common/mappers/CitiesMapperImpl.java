package ru.team38.common.mappers;

import javax.annotation.processing.Generated;
import ru.team38.common.dto.geography.CityDto;
import ru.team38.common.jooq.tables.records.CitiesRecord;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-15T12:50:19+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (IBM Corporation)"
)
public class CitiesMapperImpl implements CitiesMapper {

    @Override
    public CityDto citiesRecordToCityDto(CitiesRecord citiesRecord) {
        if ( citiesRecord == null ) {
            return null;
        }

        CityDto.CityDtoBuilder cityDto = CityDto.builder();

        cityDto.title( citiesRecord.getCityName() );
        cityDto.id( citiesRecord.getId() );
        if ( citiesRecord.getIsDeleted() != null ) {
            cityDto.isDeleted( citiesRecord.getIsDeleted() );
        }
        cityDto.zoneId( citiesRecord.getZoneId() );
        cityDto.countryId( citiesRecord.getCountryId() );
        if ( citiesRecord.getLatitude() != null ) {
            cityDto.latitude( citiesRecord.getLatitude() );
        }
        if ( citiesRecord.getLongitude() != null ) {
            cityDto.longitude( citiesRecord.getLongitude() );
        }

        return cityDto.build();
    }

    @Override
    public CitiesRecord cityDtoToCitiesRecord(CityDto cityDto) {
        if ( cityDto == null ) {
            return null;
        }

        CitiesRecord citiesRecord = new CitiesRecord();

        citiesRecord.setCityName( cityDto.getTitle() );
        citiesRecord.setId( cityDto.getId() );
        citiesRecord.setCountryId( cityDto.getCountryId() );
        citiesRecord.setLatitude( cityDto.getLatitude() );
        citiesRecord.setLongitude( cityDto.getLongitude() );
        citiesRecord.setZoneId( cityDto.getZoneId() );

        return citiesRecord;
    }
}

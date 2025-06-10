package co.repository;

import co.dto.FIRDto;

public interface FirRepository {

    boolean persist(FIRDto firDto);
}

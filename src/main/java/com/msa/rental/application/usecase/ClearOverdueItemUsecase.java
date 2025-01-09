package com.msa.rental.application.usecase;

public interface ClearOverdueItemUsecase {
    RentalResultOutputDTO clearOverdue(ClearOverdudInfoDTO clearOverdueInfoDTO) throws Exception;
}

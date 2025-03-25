package com.isaque.hexagonal.application.ports.out;

package com.isaque.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}

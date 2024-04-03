
package demo.ts.repository;

import demo.ts.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemrepo extends JpaRepository<Item, Long> {

}

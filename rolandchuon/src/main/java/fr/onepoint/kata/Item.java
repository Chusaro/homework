package fr.onepoint.kata;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {
	private int quantity;

	private float unitPrice;

	private float weight;

}

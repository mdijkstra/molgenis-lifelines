package org.molgenis.lifelines.catalog;

import nl.umcg.hl7.service.studydefinition.POQMMT000002UVObservation;

import org.molgenis.catalog.CatalogItem;

public class PoqmObservationCatalogItem implements CatalogItem
{
	private final POQMMT000002UVObservation observation;

	public PoqmObservationCatalogItem(POQMMT000002UVObservation observation)
	{
		if (observation == null) throw new IllegalArgumentException("observation is null");
		this.observation = observation;
	}

	@Override
	public String getId()
	{
		return getCode();
	}

	@Override
	public String getName()
	{
		return observation.getCode().getDisplayName();
	}

	@Override
	public String getDescription()
	{
		return observation.getCode().getOriginalText().getContent().toString();
	}

	@Override
	public String getCode()
	{
		return observation.getCode().getCode();
	}

	@Override
	public String getCodeSystem()
	{
		return observation.getCode().getCodeSystem();
	}

	@Override
	public Iterable<String> getPath()
	{
		throw new UnsupportedOperationException();
	}
}

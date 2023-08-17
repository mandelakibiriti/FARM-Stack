'use client'
import { useEffect } from 'react';
import Map from 'ol/Map.js';
import OSM from 'ol/source/OSM.js';
import TileLayer from 'ol/layer/Tile.js';
import View from 'ol/View.js';
import Script from 'next/script';
import style from '../styles/ol.module.css';

export default function ClusterMap() {
    useEffect (() => {
        const map = new Map({
            target: 'map',
            layers: [
                new TileLayer({
                    source: new OSM(),
                }),
            ],
            view: new View({
                center: [0, 0],
                zoom: 2,
            }),
        });
    }, [])



    return (
        <>
            <div id='map' className={`${style} mt-4 h-96 lg:h-96`}></div>
            <Script src= "https://cdn.jsdelivr.net/npm/ol@v7.2.2/dist/ol.js" />
        </>
    )
    
}
